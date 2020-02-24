package com.example.myapplication.ui

import androidx.lifecycle.MutableLiveData

class MainviewModel {
    private val preguntas:  MutableList<String> = mutableListOf<String>()

    val _preguntas:MutableList<String>
        get() = preguntas


    private val word = MutableLiveData<String>()
    val _word: MutableLiveData<String>
        get() = word

    private val size = MutableLiveData<Int>()
    val _size: MutableLiveData<Int>
        get() = size

    init {
        _size.value = 0
    }

    fun getQuestions() : MutableList<String>{
        return preguntas
    }

    fun addQuestion(string: String) {
        preguntas.add(string)
        _size.value = (_size.value)?.plus(1)
    }

}