# Automation Testing with Katalon Studio

## 📌 Overview

Repository ini berisi automation testing project yang dibuat menggunakan **Katalon Studio**. Proyek ini bertujuan untuk mengotomatisasi pengujian aplikasi guna memastikan kualitas dan stabilitas sebelum dirilis ke pengguna.

## 🛠 Tech Stack

- [**Katalon Studio** **Free** (free v9.5.0)](https://github.com/katalon-studio/katalon-studio/releases/tag/free-v9.5.0)
- **Groovy** (Sebagai bahasa scripting)
- **Selenium WebDriver** (Digunakan dalam Katalon)
- **Jenkins** (Opsional, untuk CI/CD)
- **Git** (Versi kontrol)

## 🚀 Features

- Automasi pengujian untuk **Web**
- Data-driven testing
- Reporting hasil pengujian
- Integrasi dengan CI/CD pipeline
- Penggunaan Page Object Model (POM) untuk struktur yang lebih terorganisir

## 📂 Project Structure

```
📦 automation-testing-katalon
 ┣ 📂 Test Cases          # Berisi test case yang dibuat dalam Katalon
 ┣ 📂 Object Repository   # Berisi kumpulan object yang digunakan dalam pengujian
 ┣ 📂 Test Suites         # Berisi kumpulan test suite untuk eksekusi batch
 ┣ 📂 Data Files         # Berisi data testing (CSV, Excel, Database, dll.)
 ┣ 📂 Reports            # Berisi hasil eksekusi test (Log, Screenshots, dll.)
 ┗ 📜 README.md          # Dokumentasi project
```

## 🔧 Setup & Installation

1. **Clone repository** ini:
   ```sh
   git clone https://github.com/miftahnz/enigma2_automation_test.git
   ```
2. **Install Katalon Studio** dari [situs resmi](https://www.katalon.com/).
3. **Buka proyek di Katalon Studio**.
4. **Konfigurasi environment** (saat belum ada).
5. **Jalankan test suite** sesuai kebutuhan.

## ▶️ How to Run Tests

- **Melalui Katalon Studio**:
  1. Buka Katalon Studio dan load project.
  2. Pilih **Test Suite** yang ingin dijalankan.
  3. Klik tombol **Run** untuk menjalankan pengujian.

## 📊 Reporting

Hasil pengujian akan tersimpan dalam folder `Reports/` dan dapat dilihat dalam format berikut:

- **HTML**
- **JUnit Report**
- **Katalon Built-in Report**
- **Screenshots (jika ada error/failure)**

## 🛠 CI/CD Integration (has not been implemented)

Untuk menjalankan test secara otomatis di **Jenkins**, tambahkan perintah berikut pada build script:

```sh
katalon -noSplash -runMode=console -projectPath="$WORKSPACE" -testSuitePath="Test Suites/RegressionTest" -browserType="Chrome" -reportFolder="$WORKSPACE/Reports"
```

## 📝 Contribution Guide

1. **Fork repository ini** dan buat branch baru untuk perubahan.
2. **Commit perubahan** dengan pesan yang jelas.
3. **Buat Pull Request** ke branch `master atau dev`.

## 📌 License

Proyek ini menggunakan lisensi **MIT License**.

---

📩 Jika ada pertanyaan atau saran, silakan buka **Issue** atau hubungi saya melalui email!

## 📝 Additional Notes
- Beberapa hal yang bisa ditambahkan untuk automation script yang lebih baik:
	- Id Unik untuk setiap objek atau elemen website terutama elemen yang interactive, seperti tombol, checkbox, dsb.
	- Toogle untuk menonactivkan fitur Captcha ketika automation test dijalankan, agar tidak perlu tindakan tambahan diluar script automation, seperti input captcha manual.
