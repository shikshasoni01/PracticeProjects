import { useReducer } from "react";

const initialState = 100;
const reducer = (state, action) => {
  switch (action) {
    case "Increment":
      return state + 1;
    case "Decrement":
      return state - 1;
  }
};

function UseReducer() {
  const [state, dispatcher] = useReducer(reducer, initialState);
  return (
    <>
      <h2>my state count is {state}</h2>
      <button
        onClick={() => {
          dispatcher("Increment");
        }}
      >
        Increment
      </button>
      <button
        onClick={() => {
          dispatcher("Decrement");
        }}
      >
        Decrement
      </button>
    </>
  );
}
export default UseReducer;
