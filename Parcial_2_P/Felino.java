public class Felino extends Animal {
    
    public Felino(String nombreCientifico, String sonido, String alimentos, String habitat) {
        super(nombreCientifico, sonido, alimentos, habitat);
    }

    @Override
    public String getSonido() {
        return super.sonido;
    }

    @Override
    public String getAlimentos() {
        return super.alimentos;
    }

    @Override
    public String getHábitat() {
        return super.habitat;
    }

    @Override
    public String getNombreCientífico() {
        return super.nombreCientifico;
    }
}