let spanDom = document.querySelector("#myName")
let clockDom = document.querySelector("#myClock")
let nameless = document.querySelector(".text-center")

let name = prompt("Adınızı giriniz: ")
spanDom.innerHTML = name


if (name == null || name == "") {
    nameless.innerHTML = "LÜTFEN ADINIZI GİRİNİZ!"

    nameless.classList.add("text-3")
    
  
}else{
    function showTime() {
        let date = new Date()
        let hours = date.getHours()
        let minutes = date.getMinutes()
        let seconds = date.getSeconds()
        let day = date.getDay()
    
        let daysOfWeek = ["Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma","Cumartesi"]
        let dayName = daysOfWeek[day]
    
        hours = hours < 10 ? "0" + hours : hours
        minutes = minutes < 10 ? "0" + minutes : minutes
        seconds = seconds < 10 ? "0" + seconds : seconds
    
        setTimeout(showTime, 1000);
    
        clockDom.innerHTML = `${hours} : ${minutes} : ${seconds} - ${dayName}`
    }
    showTime()
}







