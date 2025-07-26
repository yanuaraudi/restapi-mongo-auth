# API Endpoint yang Dipakai

## Check Active User

Method : GET   
URL : http://192.168.137.1:8080/api/sipustaha/user/activeUserData  

Response Body (Respon yang didapat setelah akses endpoint ini):
```json
{
    "code": 200,
    "error": false,
    "message": "Sukses mendapatkan data user aktif: 221402137",
    "data": {
        "id": "68748a6f5f0d8688badc0f37",
        "user_id": "221402137",
        "role": "SUPERADMIN",
        "front_degree": null,
        "full_name": "YANUAR AUDI NUGRAHA",
        "behind_degree": null,
        "work_unit_id": null,
        "work_unit_name": null,
        "photo": "https://mahasiswa.usu.ac.id/photos/221402137.jpg",
        "created_by": "seeder",
        "created_at": "2025-07-14 04:41:19",
        "updated_by": null,
        "updated_at": null
    }
}
```

Check Active User ini untuk ngambil data yang lagi login sekarang. Kalo di FE ini harusnya dipake untuk ambil tampilan profile  
![alt text](image.png)

## Get user By NIP/NIDN

Method: GET  
URL: http://192.168.137.1:8080/api/sipustaha/search  
Butuh parameter userId, jadi kalo full URLnya bakal jadi:  
http://192.168.137.1:8080/api/sipustaha/user/search?userId=1209142401040001  
Kalo di postman gini ngirimnya:  
![alt text](image-1.png)  

Response Body:
```json
{
    "id": "22921",
    "front_degree": "",
    "full_name": "Yanuar Audi Nugraha",
    "behind_degree": "",
    "npwp": "124217159111000",
    "nip": "1209142401040001",
    "nidn": "",
    "nuptk": "",
    "email": "fasilkomti@usu.ac.id",
    "work_unit_id": "44",
    "work_unit_code": "FASILKOMTI",
    "work_unit": "Fakultas Ilmu Komputer dan Teknologi Informasi",
    "study_program": "",
    "photo": "https://simsdm.usu.ac.id/photos/photo.jpg?t=1753523861",
    "type": "12",
    "type_str": "Asisten Lab",
    "status": "Aktif",
    "rank": {
        "id": null,
        "code": null
    }
}
```

Ini dipake untuk ngebuat pencarian atau pengisian author disini:  
![alt text](image-2.png)  
Disini kan nnti User ngisi NIP/NIDN itu, trus nnti bakal otomatis nyari orang yang dimaksud dari API yang ini dan munculin hasilnya. Jadi ini harus dibuat responsive, tanpa tekan enter itu hasilnya muncul.

## Get Pustaha Type (Jenis Pustaha)
### Data ini dipake untuk ini:
![alt text](image-4.png)  
Sesuai kata Bang Isa, ini datanya diambil dari API trus dimasukkan ke bagian selection ditag ```<select></select>```  
Jadi datanya diambil dulu dari URL API, habis itu di loop untuk setiap data yang didapat dari ini akan nampilin ```<option>``` sebanyak data.


Method: GET

URL: http://192.168.137.1:8080/api/sipustaha/data/types  

Response Body:
```json
[
  {
    "id": "1",
    "name": "Jurnal Internasional"
  },
  {
    "id": "2",
    "name": "Jurnal Nasional Terakreditasi"
  },
  {
    "id": "3",
    "name": "Jurnal Nasional Tidak Terakreditasi"
  },
  {
    "id": "4",
    "name": "Ajar/Teks"
  },
  {
    "id": "5",
    "name": "Hak Kekayaan Intelektual (HKI)"
  },
  {
    "id": "6",
    "name": "Buku"
  },
  {
    "id": "7",
    "name": "Paten"
  },
  {
    "id": "8",
    "name": "Jurnal Internasional Bereputasi"
  },
  {
    "id": "9",
    "name": "Proceeding Internasional Bereputasi"
  },
  {
    "id": "10",
    "name": "Proceeding Internasional"
  },
  {
    "id": "11",
    "name": "Proceeding Nasional Terakreditasi"
  },
  {
    "id": "12",
    "name": "Proceeding Nasional Tidak Terakreditasi"
  },
  {
    "id": "13",
    "name": "Paten Sederhana"
  },
  {
    "id": "14",
    "name": "Panduan atau Kebijakan"
  },
  {
    "id": "15",
    "name": "Slide Presentasi Interaktif"
  },
  {
    "id": "16",
    "name": "Laporan Penelitian"
  },
  {
    "id": "17",
    "name": "Animasi Interaktif"
  },
  {
    "id": "18",
    "name": "Simulasi Interaktif"
  },
  {
    "id": "19",
    "name": "Aplikasi Interaktif"
  },
  {
    "id": "20",
    "name": "Video Pembelajaran Interaktif"
  },
  {
    "id": "21",
    "name": "Reviewer Jurnal Internasional Bereputasi"
  },
  {
    "id": "22",
    "name": "Chief Editor Jirnal Internasional"
  },
  {
    "id": "23",
    "name": "Editor/Editor Board/Advisory Board Jurnal Internasional"
  },
  {
    "id": "24",
    "name": "Best Presenter"
  }
]
```

## Fund Sources (Sumber Dana Penelitian)
### Data ini dipakai untuk ini:
![alt text](image-5.png)  
Sama macem Jenis Pustaha  

Method: GET

URL: http://192.168.137.1:8080/api/sipustaha/data/fund-sources

Response Body:
```json
[
    {
        "id": "1",
        "name": "Mandiri"
    },
    {
        "id": "2",
        "name": "Kerja Sama"
    },
    {
        "id": "3",
        "name": "Non PNBP USU"
    },
    {
        "id": "4",
        "name": "BPPTN-BH USU"
    },
    {
        "id": "5",
        "name": "Dirjen Inovasi Kemenristekdikti RI"
    },
    {
        "id": "6",
        "name": "Kementrian Lainnya"
    },
    {
        "id": "7",
        "name": "World Class University"
    },
    {
        "id": "8",
        "name": "Program EQUITY USU"
    },
    {
        "id": "9",
        "name": "Non PNBP Fakultas"
    },
    {
        "id": "10",
        "name": "Non PNBP (RKI)"
    }
]
```

## Submit Pustaha
Method: POST

URL: http://192.168.137.1:8080/api/sipustaha/submission/create

Request Body:  
 - submission (application/json):  
```json
{
  "submission_type": "edited4",
  "submission_authors": [
    {
      "number_author": "1",
      "status": "Dosen USU, Dosen/Pegawai Luar USU, Mahasiswa, Tenaga Kependidikan USU ",
      "nip_nidn": "221402137",
      "name": "Yanuar Audi Nugraha",
      "affiliation": "TI USU"
    },
    {
      "number_author": "2",
      "status": "Dosen USU, Dosen/Pegawai Luar USU, Mahasiswa, Tenaga Kependidikan USU ",
      "nip_nidn": "011",
      "name": "Seeder seeder seeder",
      "affiliation": "ILKOM USU"
    },
    {
      "number_author": "3",
      "status": "Dosen USU, Dosen/Pegawai Luar USU, Mahasiswa, Tenaga Kependidikan USU ",
      "nip_nidn": "012",
      "name": "Seeder seeder seeder seeder",
      "affiliation": "ELEKTRO USU"
    },
    {
      "number_author": "4",
      "status": "Dosen USU, Dosen/Pegawai Luar USU, Mahasiswa, Tenaga Kependidikan USU ",
      "nip_nidn": "013",
      "name": "Seeder seeder seeder seeder seeder",
      "affiliation": "KEDOKTERAN USU"
    }
  ],
  "co_author": "Corresponding Author",
  "title": "Article Title",
  "fund_source": "This research is funded by the USU Research Grant 2024",
  "edition_number": "1",
  "volume": "9",
  "pages": "1-15",
  "year": 2024,
  "article_web_link": "https://example.com/article",
  "journal_name": "Journal of Example Studies",
  "journal_web_link": "https://example.com/journal",
  "issn": "1234-5678",
  "ifows": 0.123,
  "sjr": 0.456,
  "quartile": "Q2",
  "affiliation": "Universitas Sumatera Utara",
  "journal_statuses": {
    "scopus": "true",
    "web_of_science": "true",
    "ieeex": "false",
    "usu_email": "true",
    "usu_affiliated": "true",
    "proceeding_special": "false",
    "procedia_elsavier": "false",
    "lecture_note": "false",
    "usu_talenta_journal": "false"
    },
  "submission_status": "SUBMITTED",
  "article": "seeder",
  "sister": "seeder",
  "submission_prove": "seeder"
}
```

 - article (file, multipart/form-data)
 ![alt text](image-7.png)
 - sister (file, multipart/form-data)
 ![alt text](image-8.png)
 - submission_prove (file, multipart/form-data)
 ![alt text](image-9.png)
 (Untuk Submission Prove ini engga wajib)

Kalo di postman kaya gini:  
![alt text](image-6.png)

Di proses submit ini, gaperlu banyak ngapa ngapain selain kirim 4 itu (submission, article, sister, submission_prove) ke API atau URL ini.