 class Predator(name: String,  size: String, var hunting: String, var special: String) : Animals( name, size){
     override fun toString(): String {
         return "Predator(name= '$name',size='$size' hunting='$hunting', special='$special')"
     }
 }