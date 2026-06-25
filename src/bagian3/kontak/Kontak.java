package bagian3.kontak;

public class Kontak {
    
    private String nama; 
    private String nomor;

   
    public Kontak(String nama, String nomor) { 
        this.nama = nama;
        this.nomor = nomor; 
    }

   
    public String getNama() { 
        return nama;
    }

    public String getNomor() { 
        return nomor; 
    }

  
    public String keBaris() { 
        return nama + ";" + nomor; 
    }

    
    public String info() { 
        return nama + " " + nomor; 
    }
}