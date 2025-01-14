import { useMemo, useState } from "react";
import UseCallBack from "./UseCallBack";
import { useCallback } from "react";

function MeMo() {
  const [add, setAdd] = useState(0);
  const test = useCallback(() => {
    {
    }
  }, []);
  const [sub, setSub] = useState(100);
  const multiply = useMemo(() => {
    console.log("called");
    return add * 10;
  }, []);
  //[]= only when application loaded
  //[add]= only when add changes
  return (
    <>
      <h1>Multiplication is {multiply}</h1>
      <h1>Addition is {add}</h1>
      <button
        onClick={() => {
          setAdd(add + 1);
        }}
      >
        Adition
      </button>
      <br></br>
      <h1>Subtraction is {sub}</h1>
      <button
        onClick={() => {
          setSub(sub - 1);
        }}
      >
        Subtraction
      </button>

      <UseCallBack data={test}></UseCallBack>
    </>
  );
}
export default MeMo;
