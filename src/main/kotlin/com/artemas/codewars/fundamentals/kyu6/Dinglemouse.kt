package com.artemas.codewars.fundamentals.kyu6

class Dinglemouse {

    private val info = linkedMapOf("hello" to "Hello.")

    fun setAge(age: Int) = apply { info["age"] = "I am $age." }
    fun setSex(sex: Char) = apply { info["sex"] = "I am ${if (sex == 'M') "male" else "female"}." }
    fun setName(name: String) = apply { info["name"] = "My name is $name." }

    fun hello() = info.values.joinToString(" ")

}
