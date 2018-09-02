package me.chen_wei.samples.dialog

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    var singleDialogButton: Button? = null
    var normalDialogButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        singleDialogButton = findViewById(R.id.single_button_dialog)
        singleDialogButton?.setOnClickListener {
            showDialog {
                cancelOutside = false
                title = "Dialog Fragment"
                message = "A fragment that displays a dialog window, floating on top of its activity's window. "
                rightClicks(key = "Yes") {
                    toast("Right Button Clicked!")
                }
            }
        }

        normalDialogButton = findViewById(R.id.normal_dialog)
        normalDialogButton?.setOnClickListener {
            showDialog {
                cancelOutside = true
                title = "Dialog Fragment"
                message = "A fragment that displays a dialog window, floating on top of its activity's window. "
                leftClicks("No", false) {
                    toast("Left Button Clicked!")
                }
                rightClicks {
                    toast("Right Button Clicked!")
                }
            }
        }
    }
}
