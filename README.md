# Portiernia2023
## Opis
Aplikacja powstała jako remake programu portiernia2021. Tamten program był aplikacją desktopową, natomiast ten jest napisany z 
użyciem najnowszych technologii takich jak Spring Boot czy Hibernate'a. Jest uproszczony względem swojego poprzednika - udało się znacznie
zmniejszyć ilość kodu. Ograniczyłem także ilość tabeli, stosując m.in enumy.

## Instalacja

 1. Aby zainstalować program należy sklonować to repozytorium na komputer.
 2. Aby aplikacja działała poprawnie, należy zainstalować program MySQL Workbench i utworzyć w nim bazę danych o nazwię "portiernia2023".
 3. Po zainstalowaniu należy otworzyć aplikację w IDE i w application.properties dodać nazwę użytkownika i hasło do MySQL.
 4. Aby automatyczne wysyłanie maili zostało włączone, należy podać w application.properties login i hasłoDoAplikacji - żeby je wygenerować trzeba mieć włączoną weryfikację dwuetapową w google. Należy także odkomentować kod w plikach EmailSender.java oraz EmailSenderService.java.
 5. Uruchomić aplikację.
 6. Zalogować się za pomocą loginu admin lub user oraz wprowadzić hasło: 1234.
 7. Można używać aplikacji POSTMAN do edytowania rekordów w bazie danych.

