import { useState } from "react";

function Count() {
  const [count, setCount] = useState(0);

  function increment() {
    setCount(count + 1);
  }

  return (
    <>
      <h1>Count = {count}</h1>
      <button onClick={increment}> To Increment Click Me</button>
      <button
        onClick={() => {
          setCount(count - 1);
        }}
      >
        To Decrement Click Me
      </button>
    </>
  );
}

export default Count;
