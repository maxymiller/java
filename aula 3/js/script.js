const table_a2 = document.getElementById("table_a2");
const table_b2 = document.getElementById("table_b2");
const table_c2 = document.getElementById("table_c2");

const table_a3 = document.getElementById("table_a3");
const table_b3 = document.getElementById("table_b3");
const table_c3 = document.getElementById("table_c3");

//table_a2. = "<a></a>"

const url = "http://teste";

function verJson(json) {
    return JSON.stringify(json)
}

function clickJs(button) {
    try{
        //button.
        

        //alert(button)
        if(button == 1) {

            var auxiliar = prompt("Digite um número")
            switch(parseInt(auxiliar)){
                case 1:
                    table_a2.innerHTML = "<img src=\"imagens/download (1).jpeg\">";
                    break
                case 2:
                    table_b2.innerHTML = "<img src=\"imagens/images (1).jpeg\">";
                    break
                case 3:
                    table_c2.innerHTML = "<img src=\"imagens/download (3).jpeg\">";
                    break
                case 4:
                    table_a3.innerHTML = "<img src=\"imagens/download (4).jpeg\">";
                    break
                case 5:
                    table_b3.innerHTML = "<img src=\"imagens/download (5).jpeg\">";
                    break
                case 6:
                    //table_c3.innerHTML = "<img src=\"imagens/images.jpeg\">";
                    table_c3.innerHTML = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/AdaLFWPYNQ4?si=YLdbOuhAz-mh28x4\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"
                    break
                default:
                    alert("NÚMERO INVÁLIDO")
            }

            //table_a2.textContent = "<img src=\"imagens/download (1).jpeg\">";
            //table_b2.textContent = "<img src=\"imagens/download (2).jpeg\">";
            //table_c2.textContent = "<img src=\"imagens/download (3).jpeg\">";

            //table_a3.textContent = "<img src=\"imagens/download (4).jpeg\">";
            //table_b3.textContent = "<img src=\"imagens/download (5).jpeg\">";
            //table_c3.textContent = "<img src=\"imagens/images.jpeg\">";
        }else if(button == 2) {
            alert("ok");
            table_a2.textContent = 1;
            table_b2.textContent = 2;
            table_c2.textContent = 3;

            table_a3.textContent = 4;
            table_b3.textContent = 5;
            table_c3.textContent = 6;
        }
    }catch(e){
        console.error(e)
    }
}

async function loop() {
    try{
        const response = await fetch(url)
        if(!response.ok) throw new Error('Erro ao carregar: ' + response.status);
        const data = await response.json();
        //verJson()
    }catch(e){
        
    }
}
//loop();
//setInterval(loop, 1000)