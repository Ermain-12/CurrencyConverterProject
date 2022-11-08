package com.ermain.currencyconverterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var currencyOptions: Spinner
    private lateinit var currencyAmount: EditText
    private lateinit var convertButton: Button
    private lateinit var conversionAmountView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        convertButton = findViewById(R.id.buttonConvert)
        currencyOptions = findViewById(R.id.spinnerCurrencyTypes)
        // conversionAmountView = findViewById(R.id.editTextCurrencyAmount)

        val currencyNames = resources.getStringArray(R.array.currency_array)

        val c = ArrayAdapter(this, android.R.layout.simple_spinner_item, currencyNames)
        c.setDropDownViewResource(android.R.layout.simple_spinner_item)
        currencyOptions.adapter = c

        currencyAmount = findViewById(R.id.editTextCurrencyAmount)
        conversionAmountView = findViewById(R.id.textViewConversionAmountView)

        currencyOptions.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                convertButton.setOnClickListener {
                    val currency = parent?.getItemAtPosition(position).toString()
                    val amount = currencyAmount.text.toString().toInt()
                    when(currency) {
                        "AUD" -> {
                            val conversionRate = 1.5459
                            val newAmount: Double = amount * conversionRate
                            conversionAmountView.visibility = View.VISIBLE
                            conversionAmountView.text = newAmount.toString()
                        }
                        "GBP" -> {
                            val conversionRate = 0.86881
                            val newAmount: Double = amount * conversionRate
                            conversionAmountView.visibility = View.VISIBLE
                            conversionAmountView.text = newAmount.toString()
                        }
                        "EUR" -> {
                            val conversionRate = 0.99868
                            val newAmount: Double = amount * conversionRate
                            conversionAmountView.visibility = View.VISIBLE
                            conversionAmountView.text = newAmount.toString()
                        }
                        "TRY" -> {
                            val conversionRate = 18.4645
                            val newAmount: Double = amount * conversionRate
                            conversionAmountView.visibility = View.VISIBLE
                            conversionAmountView.text = newAmount.toString()
                        }
                        "CAD" -> {
                            val conversionRate = 1.3502
                            val newAmount: Double = amount * conversionRate
                            conversionAmountView.visibility = View.VISIBLE
                            conversionAmountView.text = newAmount.toString()
                        }
                        "BRL" -> {
                            val conversionRate = 1.5459
                            val newAmount: Double = amount * conversionRate
                            conversionAmountView.visibility = View.VISIBLE
                            conversionAmountView.text = newAmount.toString()
                        }
                        "CNY" -> {
                            val conversionRate = 1.5459
                            val newAmount: Double = amount * conversionRate
                            conversionAmountView.visibility = View.VISIBLE
                            conversionAmountView.text = newAmount.toString()
                        }
                        "CZK" -> {
                            val conversionRate = 1.5459
                            val newAmount: Double = amount * conversionRate
                            conversionAmountView.visibility = View.VISIBLE
                            conversionAmountView.text = newAmount.toString()
                        }
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}