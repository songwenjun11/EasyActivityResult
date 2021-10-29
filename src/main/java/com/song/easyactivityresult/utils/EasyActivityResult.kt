package com.song.easyactivityresult.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.song.easyactivityresult.activity.ExcessiveActivity
import com.song.easyactivityresult.entity.Result

/**
 * Created by SongWenjun
 * 2021/10/12
 *       ∩ _ ∩
 *      (??ω??)っ一? ?? ???
 *        っ 丿         ? ????
 *     乚― J               ???
 * This class is ...
 */
class EasyActivityResult private constructor() {

    companion object {
        var easyActivityResult: EasyActivityResult? = null

        fun getInstance(): EasyActivityResult {
            if (easyActivityResult == null) {
                synchronized(EasyActivityResult::class.java) {
                    if (easyActivityResult == null) {
                        easyActivityResult = EasyActivityResult()
                    }
                }
            }
            return easyActivityResult!!
        }
    }

    fun startIntent(
        context: Activity,
        intent: Intent,
        call: (Result) -> Unit
    ): EasyActivityResult {
        ResultCallBack.getInstance().intent = intent
        ResultCallBack.getInstance().resultCode = 10
        ResultCallBack.getInstance().call = call
        val i = Intent(context, ExcessiveActivity::class.java)
        context.startActivityForResult(i, ResultCallBack.getInstance().resultCode)
        return getInstance()
    }
}