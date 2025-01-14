let boxes = document.querySelectorAll(".box");
let resetBtn= document.querySelector("#reset");

//player1 =>turn = true 
//player2 =>turn = false

let turn = true;

const rightMatch=[
    [0,1,2],[0,3,6],[0,4,8],[1,4,7],[2,5,8],[2,4,8],[3,4,5],[6,7,8]
];
boxes.forEach(
    (box)=>{
        box.addEventListener("click",()=>
        {
            // console.log("box clicked")
            if(turn)
            {
                box.innerText ="0";
                turn=false;
            }
            else{
                box.innerText ="X";
                turn=true;;
            }
            box.disabled=true;

            checkWin();
        });
    });

    const checkWin = () => {
        for(let match of rightMatch)
        {

            // console.log(match[0],match[1],match[2]);
            // console.log(
            //     boxes[match[0]].innerText,
            //     boxes[match[1]].innerText,
            //     boxes[match[2]].innerText);

            let box1val= boxes[match[0]].innerText;
            let box2val= boxes[match[1]].innerText;
            let box3val= boxes[match[2]].innerText;

            if(box1val != "" && box2val != "" && box3val != "")
            {
                if(box1val === box2val && box2val === box3val)
                {
                    console.log("winner",box1val);
                }
            }
        }
    }