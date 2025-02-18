Automation Testing with Katalon Studio

📌 Overview

Repository ini berisi automation testing project yang dibuat menggunakan Katalon Studio. Proyek ini bertujuan untuk mengotomatisasi pengujian aplikasi guna memastikan kualitas dan stabilitas sebelum dirilis ke pengguna.

🛠 Tech Stack

Katalon Studio Free (v9.5.0)

Groovy (Sebagai bahasa scripting)

Selenium WebDriver (Digunakan dalam Katalon)

Jenkins (Opsional, untuk CI/CD)

Git (Versi kontrol)

🚀 Features

Automasi pengujian untuk Web

Data-driven testing

Reporting hasil pengujian

Integrasi dengan CI/CD pipeline

Penggunaan Page Object Model (POM) untuk struktur yang lebih terorganisir

📂 Project Structure

📦 automation-testing-katalon
 ┣ 📂 Test Cases          # Berisi test case yang dibuat dalam Katalon
 ┣ 📂 Object Repository   # Berisi kumpulan object yang digunakan dalam pengujian
 ┣ 📂 Test Suites         # Berisi kumpulan test suite untuk eksekusi batch
 ┣ 📂 Data Files         # Berisi data testing (CSV, Excel, Database, dll.)
 ┣ 📂 Reports            # Berisi hasil eksekusi test (Log, Screenshots, dll.)
 ┗ 📜 README.md          # Dokumentasi project

🔧 Setup & Installation

Clone repository ini:

git clone https://github.com/miftahnz/enigma2_automation_test.git

Install Katalon Studio dari situs resmi.

Buka proyek di Katalon Studio.

Konfigurasi environment (saat belum ada).

Jalankan test suite sesuai kebutuhan.

▶️ How to Run Tests

Melalui Katalon Studio:

Buka Katalon Studio dan load project.

Pilih Test Suite yang ingin dijalankan.

Klik tombol Run untuk menjalankan pengujian.

📊 Reporting

Hasil pengujian akan tersimpan dalam folder Reports/ dan dapat dilihat dalam format berikut:

HTML

JUnit Report

Katalon Built-in Report

Screenshots (jika ada error/failure)

🛠 CI/CD Integration (has not been implemented)

Untuk menjalankan test secara otomatis di Jenkins, tambahkan perintah berikut pada build script:

katalon -noSplash -runMode=console -projectPath="$WORKSPACE" -testSuitePath="Test Suites/RegressionTest" -browserType="Chrome" -reportFolder="$WORKSPACE/Reports"

📝 Contribution Guide

Fork repository ini dan buat branch baru untuk perubahan.

Commit perubahan dengan pesan yang jelas.

Buat Pull Request ke branch master atau ``dev.

📌 License

Proyek ini menggunakan lisensi MIT License.

📩 Jika ada pertanyaan atau saran, silakan buka Issue atau hubungi saya melalui email!

