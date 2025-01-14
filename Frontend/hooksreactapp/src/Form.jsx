import { useState } from "react";

function Form() {
  const [fname, setFname] = useState("");
  const [lname, setLname] = useState("");

  function handleChange(e) {
    setFname(e.target.value);
  }
  function handleChange1(e) {
    setLname(e.target.value);
  }

  return (
    <>
      <h1>Form</h1>
      <input type="text" value={fname} id="fname" onChange={handleChange} />
      <input type="text" value={lname} id="lname" onChange={handleChange1} />
      <button>Submit</button>
    </>
  );
}

export default Form;
