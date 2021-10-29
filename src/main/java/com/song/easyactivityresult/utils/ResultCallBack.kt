package com.song.easyactivityresult.utils

import android.content.Intent
import com.song.easyactivityresult.entity.Result

/**
 * Created by SongWenjun
 * 2021/10/17
 *       ∩ _ ∩
 *      (??ω??)っ一? ?? ???
 *        っ 丿         ? ????
 *     乚― J               ???
 * This class is ...
 */
class ResultCallBack private constructor() {
    var call: ((result: Result) -> Unit)? = null
    var intent:Intent? = null
    var resultCode = 0

    companion object {
        @JvmStatic
        private val resultCallBack: ResultCallBack = ResultCallBack()

        @JvmStatic
        fun getInstance() = resultCallBack
    }

    fun call(requestCode: Int, resultCode: Int, data: Intent?) {
        if (call != null)
            call?.invoke(Result(requestCode, resultCode, data))
    }
}