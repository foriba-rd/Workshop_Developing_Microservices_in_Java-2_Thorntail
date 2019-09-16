# Foriba R&D Thorntail Java Test Projesi
  Bu proje Foriba R&D Thorntail Java Test Projesi'nin nasıl çalıştığı ile ilgili örnek olması için oluşturulmuştur.
- Proje get ve post işlemi yapan, post işlemi ile get edilen mesajı değiştir.


## Kurulum

1- Proje maven proje olarak oluşturulmuş. Maven'ın kurulu olması gerekmketdir.

2- jar dosyasının oluşturulması için aşağıdaki komutu cmd yazarak oluşturabilirsiniz.

    mvn clean package
	

3- Oluşturulan jar dosyası, target klasörü içerisinde ** demo_mp_thorntail_01-thorntail.jar ** oluşturacaktır. Daha sonrasında aşağıdaki komutu çalıştırarak uygulmaya çalıştırabilirsiniz.

    java -jar demo_mp_thorntail_01-thorntail.jar


### GET
http://localhost:8080/data/hello,

### POST
http://localhost:8080/data/hello/OLA


### Config
http://localhost:8080/data/config/lookup


### Fault tolerance
http://localhost:8080/data/resilience


### Health
http://localhost:8080/health


### Metrics
http://localhost:8080/metrics


# Lisans

"Foriba R&D Thorntail Java Test Projesi"projesi, Foriba R&D ekibi tarafından bir eğitim içeriği olarak hazırlanmıştır, izinsiz olarak ticari uygulamalarda kullanılması yasaktır.
