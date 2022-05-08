package gonzalez.edith.proyectofinalreel

data class User(var nameUs: String ?= null,var contra : String ?= null,var repContra : String ?= null,var email : String ?= null){
    override fun toString() = nameUs + "\t" + contra + "\t" + repContra + "\t" + email
}
