package generic;

class mahasiswa
<NI,NM,NL>{
    private NI nim;
    private NM nama;
    private NL nilai;

    public void setNim(NI nim) {
        this.nim = nim;
    }

    public NI getNim() {
        return nim;
    }

    public void setName(NM name) {
        this.nama = name;
    }

    public NM getName() {
        return nama;
    }
    
    public void setClas(NL nilai) {
        this.nilai = nilai;
    }

    public NL getClas() {
        return nilai;
    }

}

public class GenMahasiswa{
    
    public static void main(String[] args) {
        
        mahasiswa
        <String, String, Integer> m = new mahasiswa
        <>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);
        
        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}