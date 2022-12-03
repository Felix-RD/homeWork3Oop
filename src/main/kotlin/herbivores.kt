class Herbivores (name: String, size: String,var disguise:String, var defense:String) : Animals(name, size) {

    override fun toString(): String {
        return "Herbivores(name= '$name',size='$size'disquse= '$disguise', defense='$defense')"
    }
}