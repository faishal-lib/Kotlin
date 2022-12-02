class GPokok(var description: String, var pokok: Int, var tunjangan: Int, var lembur: Int ) {
  // Class function
  fun drive() {
    println("Bruumm!")
  }
}

fun main(args: Array<String>) {  
  val g1 = GPokok("== golongan A ==", 1486500, 250000, 20000)
  val g2 = GPokok("== golongan B ==", 1926000, 300000, 20000)
  val g3 = GPokok("== golongan C ==", 2456700, 350000, 20000)
  val g4 = GPokok("== golongan D ==", 2899500, 400000, 20000)
  
  // Input Data Here
  
  val jumlah_karyawan = 3
  val golongan = 4
  val jam_kerja = 178
    
  val selisih_jam = jam_kerja-173
    
  if(golongan == 1){
  
      val gaji = g1.pokok + g1.tunjangan

      if (jam_kerja > 173){
          val bayar_lembur = g1.lembur*selisih_jam

          +bayar_lembur
          val pajak = gaji*0.005

          val bersih = gaji - pajak

          // Print property values
          println(g1.description + '\n' +"Gaji Pokok : Rp." + g1.pokok + '\n'  
                  + "Tunjangan : Rp." + g1.tunjangan + '\n' 
                  + "Jam Lembur : " + selisih_jam + " Jam" +'\n'
                  + "Uang Lembur : Rp." + g1.lembur*selisih_jam + '\n' + '\n'
                  + "Total Gaji : Rp." + gaji + '\n' 
                  + "pajak : Rp." + pajak + '\n' + '\n'
                  + "Bersih Dipotong Pajak : Rp." + bersih + '\n' + '\n'
          		  + "Jumlah Karyawan = " + jumlah_karyawan + " Orang" + '\n'
          		  + "Total Gaji Semua Karyawan = Rp." + bersih*jumlah_karyawan ) 
      }else{
          
          val pajak = gaji*0.005

          val bersih = gaji - pajak

          // Print property values
          println(g1.description + '\n' +"Gaji Pokok : Rp." + g1.pokok + '\n'  
                  + "Total Gaji : Rp." + gaji + '\n' 
                  + "pajak : Rp." + pajak + '\n' + '\n'
                  + "Bersih Dipotong Pajak : Rp." + bersih + '\n' + '\n'
          		  + "Jumlah Karyawan = " + jumlah_karyawan + " Orang" + '\n'
          		  + "Total Gaji Semua Karyawan = Rp." + bersih*jumlah_karyawan ) 

          // Call the function
          //g1.drive()
      }
   }else if(golongan == 2){
  
      val gaji = g2.pokok + g2.tunjangan

      if (jam_kerja > 173){
          val bayar_lembur = g2.lembur*selisih_jam

          +bayar_lembur
          val pajak = gaji*0.005

          val bersih = gaji - pajak

          // Print property values
          println(g2.description + '\n' +"Gaji Pokok : Rp." + g2.pokok + '\n'  
                  + "Tunjangan : Rp." + g2.tunjangan + '\n' 
                  + "Jam Lembur : " + selisih_jam + " Jam" +'\n'
                  + "Uang Lembur : Rp." + g2.lembur*selisih_jam + '\n' + '\n'
                  + "Total Gaji : Rp." + gaji + '\n' 
                  + "pajak : Rp." + pajak + '\n' + '\n'
                  + "Bersih Dipotong Pajak : Rp." + bersih + '\n' + '\n'
          		  + "Jumlah Karyawan = " + jumlah_karyawan + " Orang" + '\n'
          		  + "Total Gaji Semua Karyawan = Rp." + bersih*jumlah_karyawan ) 
      }else{
          
          val pajak = gaji*0.005

          val bersih = gaji - pajak

          // Print property values
          println(g2.description + '\n' +"Gaji Pokok : Rp." + g2.pokok + '\n'  
                  + "Total Gaji : Rp." + gaji + '\n' 
                  + "pajak : Rp." + pajak + '\n' + '\n'
                  + "Bersih Dipotong Pajak : Rp." + bersih + '\n' + '\n'
          		  + "Jumlah Karyawan = " + jumlah_karyawan + " Orang" + '\n'
          		  + "Total Gaji Semua Karyawan = Rp." + bersih*jumlah_karyawan ) 

          // Call the function
          //g2.drive()
      }
   }else if(golongan == 3){
  
      val gaji = g3.pokok + g3.tunjangan

      if (jam_kerja > 173){
          val bayar_lembur = g3.lembur*selisih_jam

          +bayar_lembur
          val pajak = gaji*0.005

          val bersih = gaji - pajak

          // Print property values
          println(g3.description + '\n' +"Gaji Pokok : Rp." + g3.pokok + '\n'  
                  + "Tunjangan : Rp." + g3.tunjangan + '\n' 
                  + "Jam Lembur : " + selisih_jam + " Jam" +'\n'
                  + "Uang Lembur : Rp." + g3.lembur*selisih_jam + '\n' + '\n'
                  + "Total Gaji : Rp." + gaji + '\n' 
                  + "pajak : Rp." + pajak + '\n' + '\n'
                  + "Bersih Dipotong Pajak : Rp." + bersih + '\n' + '\n'
          		  + "Jumlah Karyawan = " + jumlah_karyawan + " Orang" + '\n'
          		  + "Total Gaji Semua Karyawan = Rp." + bersih*jumlah_karyawan ) 
      }else{
          
          val pajak = gaji*0.005

          val bersih = gaji - pajak

          // Print property values
          println(g3.description + '\n' +"Gaji Pokok : Rp." + g3.pokok + '\n'  
                  + "Total Gaji : Rp." + gaji + '\n' 
                  + "pajak : Rp." + pajak + '\n' + '\n'
                  + "Bersih Dipotong Pajak : Rp." + bersih + '\n' + '\n'
          		  + "Jumlah Karyawan = " + jumlah_karyawan + " Orang" + '\n'
          		  + "Total Gaji Semua Karyawan = Rp." + bersih*jumlah_karyawan ) 

          // Call the function
          //g3.drive()
      }
   }else if(golongan == 4){
  
      val gaji = g4.pokok + g4.tunjangan

      if (jam_kerja > 173){
          val bayar_lembur = g4.lembur*selisih_jam

          +bayar_lembur
          val pajak = gaji*0.005

          val bersih = gaji - pajak

          // Print property values
          println(g4.description + '\n' +"Gaji Pokok : Rp." + g4.pokok + '\n'  
                  + "Tunjangan : Rp." + g4.tunjangan + '\n' 
                  + "Jam Lembur : " + selisih_jam + " Jam" +'\n'
                  + "Uang Lembur : Rp." + g4.lembur*selisih_jam + '\n' + '\n'
                  + "Total Gaji : Rp." + gaji + '\n' 
                  + "pajak : Rp." + pajak + '\n' + '\n'
                  + "Bersih Dipotong Pajak : Rp." + bersih + '\n' + '\n'
          		  + "Jumlah Karyawan = " + jumlah_karyawan + " Orang" + '\n'
          		  + "Total Gaji Semua Karyawan = Rp." + bersih*jumlah_karyawan ) 
      }else{
          
          val pajak = gaji*0.005

          val bersih = gaji - pajak

          // Print property values
          println(g4.description + '\n' +"Gaji Pokok : Rp." + g4.pokok + '\n'  
                  + "Total Gaji : Rp." + gaji + '\n' 
                  + "pajak : Rp." + pajak + '\n' + '\n'
                  + "Bersih Dipotong Pajak : Rp." + bersih + '\n' + '\n'
          		  + "Jumlah Karyawan = " + jumlah_karyawan + " Orang" + '\n'
          		  + "Total Gaji Semua Karyawan = Rp." + bersih*jumlah_karyawan ) 

          // Call the function
          //g4.drive()
      }
   }
}


