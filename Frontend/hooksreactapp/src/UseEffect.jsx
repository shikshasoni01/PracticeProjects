import { useEffect, useState } from "react";

function UseEffect() {
  const [count, setCount] = useState(0);
  const [data, setData] = useState(100);

  //stop  rendering with empty []
  //   useEffect(() => {
  //     console.log("rendering");
  //   }, []);
  //  rendering will happening when any changes made to data  [data]
  //   useEffect(() => {
  //     console.log("rendering");
  //   }, [data]);
  //  rendering will happening when any changes made to data as well as count [data,count]
  //   useEffect(() => {
  //     console.log("rendering");
  //   }, [data, count]);

  const [formdata, setFormData] = useState([]);
  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/todos/2")
      .then((response) => response.json())
      .then((json) => setFormData(json));
  }, [count]);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/todos/3")
      .then((response) => response.json())
      .then((json) => console.log(json));
  }, [data]);

  return (
    <>
      {/* <button
        onClick={() => {
          setCount(count - 1);
        }}
      >
        Click me not rendering
      </button>
      <button
        onClick={() => {
          setData(data - 1);
        }}
      >
        Click me for rendering
      </button> */}
      <button
        onClick={() => {
          setCount(count - 1);
        }}
      >
        Click me count rendering
      </button>
      <button
        onClick={() => {
          setData(data - 1);
        }}
      >
        Click me data rendering
      </button>
    </>
  );
}
export default UseEffect;
