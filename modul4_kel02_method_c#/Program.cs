using System;

namespace modul4_kel02_method_c_
{
    class Program
    {
        static void Main(string[] args)
        {
            percobaan2 objek = new percobaan2();
            objek.pembagian(39, 35);
            Console.WriteLine("Hasil pengurangan {0} dengan {1} adalah {2} ", 39, 35, objek.pengurangan(39, 35)); Console.ReadKey();
        }
    }
}
