package com.song.easyactivityresult.utils

import android.app.Activity
import android.content.Context
import android.content.Intent

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

    lateinit var callBack: (requestCode: Int, resultCode: Int, data: Intent) -> Unit

    companion object {
        @JvmStatic
        private var easyActivityResult: EasyActivityResult? = null

        @JvmStatic
        fun init(context: Context) {

        }

        @JvmStatic
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
        activity: Activity?,
        callBack: (requestCode: Int, resultCode: Int, data: Intent) -> Unit
    ) {
        this.callBack = callBack
    }
}