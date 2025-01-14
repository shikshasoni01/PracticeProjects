import { useRef, useState } from "react";

function UseRef() {
  const [data, setData] = useState("");
  const refelement = useRef("");
  console.log(refelement);

  function handledata() {
    refelement.current.focus();
    refelement.current.value = "akash";
    refelement.current.style.color = "green";
    refelement.current.style.backgroundColor = "yellow";
  }

  return (
    <>
      <input
        ref={refelement}
        type="text"
        value={data}
        onChange={(e) => {
          setData(e.target.value);
        }}
      ></input>
      <button onClick={handledata}>submit</button>
    </>
  );
}
export default UseRef;
