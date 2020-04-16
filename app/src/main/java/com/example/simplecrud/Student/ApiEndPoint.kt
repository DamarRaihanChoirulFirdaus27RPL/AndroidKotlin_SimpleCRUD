package com.example.simplecrud.Student

class ApiEndPoint {
    companion object {

        private val SERVER = "https://simplecrud1234.000webhostapp.com/student/"
        val CREATE = SERVER + "create.php"
        val READ = SERVER + "read.php"
        val DELETE = SERVER + "delete.php"
        val UPDATE = SERVER + "update.php"

    }
}