package com.song.easyactivityresult.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.song.easyactivityresult.utils.ResultCallBack

/**
 * Created by SongWenjun
 * 2021/10/12
 *       ∩ _ ∩
 *      (??ω??)っ一? ?? ???
 *        っ 丿         ? ????
 *     乚― J               ???
 * This class is ...
 */
class ExcessiveActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = ResultCallBack.getInstance().intent
        val requestCode = ResultCallBack.getInstance().resultCode
        startActivityForResult(intent, requestCode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        setResult(requestCode, data)
        ResultCallBack.getInstance().call(requestCode, resultCode, data)
        finish()
    }
}