package com.example.bahasapemrogaman;

import com.example.bahasapemrogaman.Bahasa;
import com.example.bahasapemrogaman.R;

import java.util.ArrayList;

public class BahasaData {
    private static String[] bahasaNames = {
            "JAVA",
            "PHYTON",
            "C++",
            "KOTLIN",
            "PHP",
            "RUBY",
            "JAVASCRIPT",
            "C#",
            "SWIFT",
            "SQL"

    };

    private static String[] bahasaDetails = {
            "Java merupakan bahasa pemrograman yang dapat dijalankan di berbagai platform, dari mulai PC sampai perangkat mobile. com.example.bahasapemrogaman.Bahasa pemrograman ini awalnya dikembangkan pada The Green Project pada tahun 1991 oleh Sun Microsystem yang kemudian dilepas pada Oracle. Nama Java sendiri dipilih karena salah seorang pendiri Java, James Gosling, sangat menyukai kopi murni yang langsung digiling dari mesin giling (kopi tubruk) dimana kopi jenis ini berasal dari pulau Jawa di Indonesia.",
            "Dalam tingkatan bahasa pemrograman, Python termasuk bahasa tingkat tinggi. Python menjadi salah satu bahasa pemrograman yang dapat membangun aplikasi, baik itu berbasis web ataupun berbasis mobile. com.example.bahasapemrogaman.Bahasa phyton ini termasuk kedalam bahasa pemorgraman yang cukup mudah bagi pemula, karena bahasa tersebut mudah untuk dibaca dengan syntax yang mudah untuk dipahami juga. Banyak perusahaan besar menggunanakn Phyton dalam pengembanganya seperti Instagram, Pinterest dan Rdio. Python juga digunakan oleh para pengembang Google, Yahoo!, dan juga NASA.",
            "C++ merupakan bahasa pemrograman pengembangan dari bahasa C. C++ dan C memiliki sintaks penulisan yang hampir sama, meski begitu kedua bahasa pemrograman ini memiliki perbedaan pada penyelesaian masalahnya. Pada bahasa C penyelesaian masalah dilakukan dengan membagi-bagi kedalam sub-sub masalah yang lebih kecil lagi atau bisa disebut bahasa pemrograman prosedural, sedangakan C++ berorientasi pada objek dimana permasalahan dibagi-bagi kedalam class-class. C++ pertama kali dikembangkan oleh Bjarne Stroustrup.",
            "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia.Meskipun sintaksisnya tidak kompatibel dengan bahasa Java, Kotlin didesain untuk dapat bekerja sama dengan kode bahasa Java dan bergantung kepada kode bahasa Java dari Kelas Pustaka Java yang ada, seperti berbagai framework Java yang ada. Tim Pengembang memutuskan menamakannya Kotlin dengan mengambil nama dari sebuah pulau di Rusia, sebagaimana Java yang mengambil nama dari pulau Jawa di Indonesia.Setelah Google mengumumkan bahwa Kotlin menjadi bahasa kelas satu bagi Android, maka bersama Java dan C++, Kotlin menjadi bahasa resmi untuk pengembangan aplikasi-aplikasi Android.",
            "PHP Hypertext Preprocessor[3] adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML.[4][5] PHP banyak dipakai untuk memprogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS.Tidak hanya berjalan melalui peladen web, PHP juga bisa menyelesaikan tugas-tugas pemrograman dalam bentuk antarmuka baris perintah (CLI).",
            "Ruby merupakan bahasa pemrograman yang dinamis, refletif, elegan, dan berbasis objek. Menurut situs ruby-lang.org ” Ruby adalah sahabat terbaik programmer “. Ruby bersifat open source, mudah dimengerti, dan produktif. Kode-kode Ruby cukup elegan, naturan, mudah dibaca dan ditulis.Ruby memiliki fungsi yang sangat bagus. Diantaranya dapat digunakan untuk membuat aplikasi web, GUI, dan banyak lagi. Salah satu platform yang dikembangkan menggunakan bahasa Ruby adalah Twitter.",
            "JavaScript adalah bahasa pemrograma yang dikembangkan oleh Netscape. Penggunaan JavaScript saat ini kebanyakan terdapat pada pengembangan web. Dengan JavaScript ini kita bisa membuat web yang interaktif dan menarik. Di Indonesia sendiri terdapat grup Facebook yang membahas tentang JavaScript ini dengan nama JavaScript Indonesia. Grup yang beranggotakan lebih dari 10 ribu orang ini masih aktif sampai sekarang.",
            "C# (dibaca: C sharp) merupakan sebuah bahasa pemrograman yang berorientasi objek yang dikembangkan oleh Microsoft sebagai bagian dari inisiatif kerangka .NET Framework. com.example.bahasapemrogaman.Bahasa pemrograman ini dibuat berbasiskan bahasa C++ yang telah dipengaruhi oleh aspek-aspek ataupun fitur bahasa yang terdapat pada bahasa-bahasa pemrograman lainnya seperti Java, Delphi, Visual Basic, dan lain-lain) dengan beberapa penyederhanaan. Menurut standar ECMA-334 C# Language Specification, nama C# terdiri atas sebuah huruf Latin C (U+0043) yang diikuti oleh tanda pagar yang menandakan angka # (U+0023). Tanda pagar # yang digunakan memang bukan tanda kres dalam seni musik (U+266F), dan tanda pagar # (U+0023) tersebut digunakan karena karakter kres dalam seni musik tidak terdapat di dalam keyboard standar",
            "Swift adalah bahasa pemrograman objek fungsional untuk pengembangan iOS dan OS X yang dibuat oleh Apple.Didesain untuk berdampingan dengan Objective-C dan menghindari program dari kode yang salah. Swift diperkenalkan oleh Apple pada acara tahunan WWDC 2014.Ini dibangun dengan compiler LLVM yang termasuk dalam Xcode 6 beta. Sebuah buku berisi 500 halaman petunjuk, The Swift Programming Language, dirilis bersamaan dengan WWDC, dan tersedia secara gratis di iBooks.",
            "SQL adalah Structured Query Language, yang merupakan bahasa komputer untuk menyimpan, memanipulasi dan mengambil data yang disimpan dalam database relasional.SQL adalah bahasa standar untuk Sistem Database Relasional. Semua Sistem Manajemen Database Relasional (RDMS) seperti MySQL, MS Access, Oracle, Sybase, Informix, Postgres dan SQL Server menggunakan SQL sebagai bahasa database standar mereka."
    };

    private static int[] bahasaImages ={
            R.drawable.java,
            R.drawable.phyton,
            R.drawable.plus,
            R.drawable.kotlin,
            R.drawable.php,
            R.drawable.ruby,
            R.drawable.js,
            R.drawable.pagar,
            R.drawable.swift,
            R.drawable.sql
    };

    static ArrayList<Bahasa> getListData(){
        ArrayList<Bahasa> list = new ArrayList<>();
        for (int position = 0; position < bahasaNames.length; position++){
            Bahasa bahasa = new Bahasa();
            bahasa.setName(bahasaNames[position]);
            bahasa.setDetail(bahasaDetails[position]);
            bahasa.setPhoto(bahasaImages[position]);
            list.add(bahasa);
        }
        return list;
    }

}
