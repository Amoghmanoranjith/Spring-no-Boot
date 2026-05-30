
# Running With External Tomcat

## 1. Build WAR File

Run:

```bash
mvn clean package
```

Generated WAR file will appear under:

```text
target/
```

---

## 2. Download Apache Tomcat

Download:

* Apache Tomcat 10+

Extract it locally.

---

## 3. Deploy WAR

Copy the generated `.war` file into:

```text
tomcat/webapps/
```

---

## 4. Start Tomcat

Windows:

```bash
tomcat/bin/startup.bat
```

Linux/macOS:

```bash
sh tomcat/bin/startup.sh
```

# Running With Embedded Tomcat

This project also contains an embedded Tomcat setup.

Run:

```bash
Main.java
```

For more insight:
https://dev.to/amoghmanoranjith/without-spring-boot-an9
