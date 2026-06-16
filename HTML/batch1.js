// console.log("Hello")
const first=document.getElementById("p1")
first.innerHTML="Some text"

function example(){
    console.log("Hello")
}
const input=document.getElementById("input")
const output=document.getElementById("inputField")
input.addEventListener("input",()=>{
    //   output.textContent=input.value
    output.innerHTMl=input.value


})
const second=document.createElement("h1")
second.textContent="New Paragraph"
document.body.appendChild(second)

// second.remove()
