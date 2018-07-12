package fr.acos.ankolayoutswithkotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.editText
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        UI(true) {
            verticalLayout {
                val etNom = editText()
                {
                    hint = "Nom"
                }
                val etPrenom = editText()
                {
                    hint = "Prénom"
                }

                val btnApply = button("Valider") {
                    onClick {
                        toast("Saisie : ${etNom.text} ${etPrenom.text}")
                    }
                    textColor = Color.WHITE
                    backgroundResource = R.color.colorPrimary
                }
            }
        }
    }
}
