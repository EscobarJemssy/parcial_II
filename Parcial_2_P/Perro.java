public class Perro extends Canido {
    public Perro() {
        super("Canis lupus familiaris", "ladrido", "carnívora", "doméstico");
    }

    @Override
    public String getSonido() {
        return super.getSonido();
    }

    @Override
    public String getAlimentos() {
        return super.getAlimentos() ;
    }

    @Override
    public String getHábitat() {
        return super.getHábitat();
    }

    @Override
    public String getNombreCientífico() {
        return super.getNombreCientífico() ;
    }
}