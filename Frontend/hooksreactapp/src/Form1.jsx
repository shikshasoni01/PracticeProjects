import { useState } from "react";
import Form2 from "./Form2";

function Form1() {
  const [formData, setFormData] = useState({
    fname: "",
    lname: "",
    email: "",
    mobileno: "",
  });

  const [buttonClick, setButtonClicked] = useState(false);

  function handleChange(e) {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  }
  function buttonClicked(e) {
    console.log(formData);
    setButtonClicked(!buttonClick);
  }
  return (
    <>
      <form>
        <label>First Name</label>
        <input
          type="text"
          name="fname"
          id="fname1"
          value={formData.fname}
          onChange={handleChange}
        />
        <br></br>
        <label>Last Name</label>
        <input
          type="text"
          id="lname"
          name="lname"
          value={formData.lname}
          onChange={handleChange}
        />
        <br></br>
        <label>Mobile Number</label>
        <input
          type="text"
          id="mobileno"
          name="mobileno"
          value={formData.mobileno}
          onChange={handleChange}
        />
        <br></br>
        <label>Email</label>
        <input
          type="text"
          id="email"
          name="email"
          value={formData.email}
          onChange={handleChange}
        />
      </form>
      <button onClick={buttonClicked} value="Submit">
        Submit
      </button>
      <Form2 data={formData}></Form2>
    </>
  );
}
export default Form1;
