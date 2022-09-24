package app.test.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autoComplete = findViewById<AutoCompleteTextView>(R.id.autoComplete)
        val suggestion = arrayOf("Apple", "Samsung", "Lenovo", "Huawei", "HTC", "Asus", "Acer")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, suggestion)

        autoComplete.threshold = 0
        autoComplete.setAdapter(adapter)
        autoComplete.setOnFocusChangeListener({view, b -> if (b) autoComplete.showDropDown()})

    }
}