public class waktu
{
    //atribut
    public int jam = 10;
    public int menit = 40;
    public int detik = 30;

    //buat 1 method getJam = menegmbalikan nilai jam jika
    //nilai jam dimasukkan sesuai dengan format jam

    public int getJam()
    {
        if(jam>0 && jam <23)
        {
            return jam;
        }
        else
        {
            return 0;
        }
    }
    // buat getMenit 
    public int getMEnit()
    {
        if(menit>0 && menit <60)
        {
            return menit;
        }
        else
        {
            return 0;
        }
    }
    //dan getDetik
    public int getDetik()
    {
        if(detik>0 && detik <60)
        {
            return detik;
        }
        else
        {
            return 0;
        }
    }
    //cetak
    public void cetakWaktu()
    {
        System.out.println("Jam : "+getJam()+"Menit :"+getMEnit()+"Detik: "+getDetik());

    }
}
