package com.yusufcanyildirim.superkahramanuygulamas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.yusufcanyildirim.superkahramanuygulamas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var superKahramanListesi : Array<SuperKahraman>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var superman = SuperKahraman("superman","gazateci",R.drawable.superman)
        var batman = SuperKahraman("batman", "Yazılımcı", R.drawable.batman)
        var flash = SuperKahraman("flash", "Fotoğrafcı", R.drawable.flash)
        var ironman = SuperKahraman("ironman","PLC Programmer", R.drawable.ironman)

        val superKahramanListesi = arrayListOf(superman, batman, flash, ironman)

        val adapter = SuperKahramanAdapter(superKahramanListesi)
        binding.superKahramanRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.superKahramanRecyclerView.adapter = adapter


    }
}