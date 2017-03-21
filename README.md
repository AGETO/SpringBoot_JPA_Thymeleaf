# SpringBoot_JPA_Thymeleaf
Spring Introduction


# Einleitung

Ziel dieses Coderepos ist es, Euch mit dem Spring Framework und dabei als erstes mit 
- Spring Boot
- JPA und
- Thymeleaf
vertraut zu machen.
JPA = Java persistence API ist eine generelle Java API um Objekte un Datenbanken zu speichern
Thymeleaf ist ein Java Templating Framework, mit dem man HTML Seite dynamisch erzeugt und mit Daten befüllen kann.

# Installation

Wichtige Grundregel: Bei Problemen oder Fragen in der INstallation oder beim Setup, immer zügig einen Kollegen fragen, damit ihr nicht zu lange irgendwo hängen bleibt 

1. Install maven   https://maven.apache.org/install.html
2. Install XAMPP   https://www.apachefriends.org/de/index.html
3. Install git     https://git-scm.com/download/win
            Lernt und arbeitet bitte gleich mit der git command line, das ist ein wichtiges SKill für jeden Programmierer, hier gibt es eine sehr gute Git Einführung https://de.slideshare.net/rschwietzke/git-the-incomplete-overview
            
# Projekt Setup 
1. Git repo clonen
    git clone https://github.com/AGETO/SpringBoot_JPA_Thymeleaf.git
2. Git Projekt mit Maven bauen
    mvn clean install
3. MySQL Datenbank anlegen
    - Xampp Dienste starten (Apache, MySQL)
    - phpmyadmin Oberfläche starten http://localhost/phpmyadmin
    - Datenbank spring_boot anlegen
4. Projekt starten
    mvn spring-boot:run
5. Webapp im Browser öffnen
    http://localhost:8080/index/create
    Einen Datensatz eingeben und auf Create klicken
6. In der Datenbank wurde nun die Tabelle Person angelegt und der Datensatz eingefügt, bitte prüfen unter
    http://localhost/phpmyadmin


# Aufgabenstellung
1. Baut eine weitere Thymeleaf Seite plus Controller, die alle Einträge aus der Tabelle Person als Liste anzeigt

    
