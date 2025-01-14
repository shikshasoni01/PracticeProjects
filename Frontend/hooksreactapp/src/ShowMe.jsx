import { useState } from "react";

function ShowMe() {
  const [isVisible, setVisibilty] = useState(false);

  return (
    <>
      <button
        style={{ fontSize: 20, border: "2px solid black" }}
        onClick={() => {
          setVisibilty(!isVisible);
        }}
      >
        {isVisible ? "Hide" : "Show"}
      </button>
      {isVisible && <h1>I am Shown when you click show button</h1>}
    </>
  );
}

export default ShowMe;
