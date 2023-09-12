package com.littlelemon.littlelemoningredients 
 
import android.content.Context 
import android.content.Intent 
import androidx.appcompat.app.AppCompatActivity 
import android.os.Bundle 
import android.widget.TextView 
 
class IngredientsActivity : AppCompatActivity() { 
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_ingredients) 
 
        val dishName = intent.getStringExtra(EXTRA_DISH_NAME_KEY) 
        findViewById<TextView>(R.id.ingredients_list).text = when (dishName) { 
            "Hamburger" -> "Minced meat\nBun\nTomato" 
            "Pasta" -> "Spaghetti\nTomato\nParmesan" 
            else -> "Unknown dish" 
        } 
    } 
 
    companion object { 
        const val EXTRA_DISH_NAME_KEY = "DishName" 
 
        fun start(context: Context, dishName: String) { 
            val intent = Intent(context, IngredientsActivity::class.java).apply { 
                putExtra(EXTRA_DISH_NAME_KEY, dishName) 
            } 
            context.startActivity(intent) 
        } 
    } 
} 