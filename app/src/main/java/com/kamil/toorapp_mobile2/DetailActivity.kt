package com.kamil.toorapp_mobile2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kamil.toorapp_mobile2.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_id = "extra_id"
        const val EXTRA_golonganWisata = "extra_golonganWisata"
        const val EXTRA_jenisWisata = "extra_jenisWisata"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getStringExtra(EXTRA_id)
        val golonganWisata = intent.getStringExtra(EXTRA_golonganWisata)
        val jenisWisata = intent.getStringExtra(EXTRA_jenisWisata)

        binding.tvDataReceivedId.text = id
        binding.tvDataReceivedGolonganWisata.text = golonganWisata
        binding.tvDataReceivedJenisWisata.text = jenisWisata
    }
}