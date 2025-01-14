import { useReducer } from "react";

const initialState = {
  name: "",
  email: "",
  password: "",
};
const reducer = (state, action) => {
  switch (action.type) {
    case "UPDATE_FIELD": {
      return { ...state, [action.field]: action.value };
    }
    case "Reset":
      return initialState;
  }
};

function LoginReducer() {
  const [state, dispatcher] = useReducer(reducer, initialState);
  function handleChange(e) {
    const { name, value } = e.target;

    dispatcher({ type: "UPDATE_FIELD", field: name, value });
  }
  function handleReset(e) {
    e.preventDefault();
    dispatcher({ type: "Reset" });
  }
  function handleSubmit(e) {
    e.preventDefault();
    if (state.name === "" || state.email === "" || state.password === "")
      alert("fields is missing");
    else console.log(state);
  }

  return (
    <>
      <h1>Registration Form</h1>
      <form
        onSubmit={handleSubmit}
        style={{ border: "2px solid black", padding: "15px" }}
      >
        <label>Name: </label>
        <input
          type="text"
          name="name"
          value={state.name}
          onChange={handleChange}
        ></input>
        <br></br>
        <br></br>
        <label>Email: </label>
        <input
          type="email"
          name="email"
          value={state.email}
          onChange={handleChange}
        ></input>
        <br></br>

        <br></br>
        <label>Password: </label>
        <input
          type="password"
          name="password"
          value={state.password}
          onChange={handleChange}
        ></input>
        <br></br>

        <br></br>
        <button type="submit">Submit</button>
        <br></br>
        <br></br>
        <button type="reset" onClick={handleReset}>
          Reset
        </button>
      </form>
    </>
  );
}
export default LoginReducer;
