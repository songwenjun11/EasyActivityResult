package com.song.easyactivityresult.entity

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
data class Result (
    var requestCode: Int,
    var resultCode:Int,
    var data: Intent?
)