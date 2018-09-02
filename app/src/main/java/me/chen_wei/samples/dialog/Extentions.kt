package me.chen_wei.samples.dialog

import android.support.v7.app.AppCompatActivity

/**
 * Created by Hander on 18/9/1.
 *
 * Email : hander_wei@163.com
 */
inline fun AppCompatActivity.showDialog(settings: CustomDialogFragment.() -> Unit) : CustomDialogFragment {
    val dialog = CustomDialogFragment.newInstance()
    dialog.apply(settings)
    val ft = this.supportFragmentManager.beginTransaction()
    val prev = this.supportFragmentManager.findFragmentByTag("dialog")
    if (prev != null) {
        ft.remove(prev)
    }
    ft.addToBackStack(null)
    dialog.show(ft, "dialog")
    return dialog
}
