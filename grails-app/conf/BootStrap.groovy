import com.masta.crud.City
import com.masta.crud.Country
import com.masta.crud.EducationType
import com.masta.crud.Gender
import com.masta.crud.Hobby
import com.masta.crud.Person
import com.masta.crud.PersonEducation
import com.masta.crud.Province
import com.masta.crud.Religion

class BootStrap {

    def init = { servletContext ->
		def countryIndo = new Country(name:"Indonesia").save(failOnError:true)
		
		def provinceJabar = new Province(name:"Jawa Barat", country:countryIndo).save(failOnError:true)
		def provinceJateng = new Province(name:"Jawa Tengah", country:countryIndo).save(failOnError:true)
		def provinceJatim = new Province(name:"Jawa Timur", country:countryIndo).save(failOnError:true)
		
		def cityBandung = new City(name:"Bandung",province:provinceJabar).save(failOnError:true)
		def cityCirebon = new City(name:"Cirebon",province:provinceJabar).save(failOnError:true)
		def cityTasik = new City(name:"Tasikmalaya",province:provinceJabar).save(failOnError:true)
		def cityKuningan = new City(name:"Kuningan",province:provinceJabar).save(failOnError:true)
		def citySemarang = new City(name:"Semarang",province:provinceJateng).save(failOnError:true)
		def citySolo = new City(name:"Solo",province:provinceJateng).save(failOnError:true)
		def cityTegal = new City(name:"Tegal",province:provinceJateng).save(failOnError:true)
		def citySurabaya = new City(name:"Surabaya",province:provinceJatim).save(failOnError:true)
		def cityMalang = new City(name:"Malang",province:provinceJatim).save(failOnError:true)
		def cityJember = new City(name:"Jember",province:provinceJatim).save(failOnError:true)
		def cityGresik = new City(name:"Gresik",province:provinceJatim).save(failOnError:true)
		
		def sd = new EducationType(name: "SD").save(failOnError:true)
		def smp = new EducationType(name: "SMP").save(failOnError:true)
		def sma = new EducationType(name: "SMA").save(failOnError:true)
		def s1 = new EducationType(name: "S1").save(failOnError:true)
		
		def male = new Gender(code: "M",  name: "Male").save(failOnError:true)
		def female = new Gender(code: "F",  name: "Female").save(failOnError:true)
		
		def computer = new Hobby(name: "Computer").save(failOnError:true)
		def music = new Hobby(name: "Music").save(failOnError:true)
		def game = new Hobby(name: "Game").save(failOnError:true)
		
		def islam = new Religion(name: "Islam").save(failOnError:true)
		def kristen = new Religion(name: "Kristen").save(failOnError:true)
		def buddha = new Religion(name: "Buddha").save(failOnError:true)
		def hindu = new Religion(name: "Hindu").save(failOnError:true)
		
		def person = new Person()
		person.name="Arkenoid"
		person.password="mjtqs123"
		person.birthDay=new Date()
		person.birthCity=citySurabaya
		person.gender=male
		person.description="Saya orang yang sangat"
		person.religion=islam
		person.hobbies=[computer,music]
		person.save(failOnError:true)
		
		def education1 = new PersonEducation(
			name: "SDN 218", 
			educationType: sd,
			person:person).save(failOnError:true)
		def education2 = new PersonEducation(
			name: "SMPN 19", 
			educationType: smp,
			person:person).save(failOnError:true)
		
    }
    def destroy = {
    }
}
