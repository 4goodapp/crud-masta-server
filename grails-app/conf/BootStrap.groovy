import com.masta.crud.City
import com.masta.crud.Country
import com.masta.crud.EducationType
import com.masta.crud.Gender
import com.masta.crud.Hobby
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
		
		new EducationType(name: "SD").save(failOnError:true)
		new EducationType(name: "SMP").save(failOnError:true)
		new EducationType(name: "SMA").save(failOnError:true)
		new EducationType(name: "S1").save(failOnError:true)
		
		new Gender(code: "M",  name: "Male").save(failOnError:true)
		new Gender(code: "F",  name: "Female").save(failOnError:true)
		
		new Hobby(name: "Computer").save(failOnError:true)
		new Hobby(name: "Music").save(failOnError:true)
		new Hobby(name: "Game").save(failOnError:true)
		
		new Religion(name: "Islam").save(failOnError:true)
		new Religion(name: "Kristen").save(failOnError:true)
		new Religion(name: "Buddha").save(failOnError:true)
		new Religion(name: "Hindu").save(failOnError:true)
    }
    def destroy = {
    }
}
