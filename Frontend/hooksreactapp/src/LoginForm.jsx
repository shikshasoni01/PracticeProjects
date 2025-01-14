import { useState } from "react";

function LoginForm() {
  const [fname, setFname] = useState("");
  const [lname, setLname] = useState("");

  function login(e) {
    {
      e.preventDefault();
      console.log(fname);
      const table = document
        .getElementById("tab")
        .getElementsByTagName("tbody")[0];
      const newRow = table.insertRow();
      const cell1 = newRow.insertCell(0);
      const cell2 = newRow.insertCell(1);
      cell1.value = { fname };
      cell2.value = { lname };
    }
  }
  return (
    <>
      <h1>Login form</h1>
      <form>
        <label>UserName</label>
        <input
          type="text"
          id="fname"
          value={fname}
          onChange={(e) => {
            setFname(e.target.value);
          }}
        />
        <br />
        <br />
        <label>Last Name</label>
        <input
          type="text"
          id="lname"
          value={lname}
          onChange={(e) => {
            setLname(e.target.value);
          }}
        />
        <br />
        <br />
        <button onClick={login}>Submit</button>
      </form>
      <br></br>
      <br></br>
      <h1>Details entered</h1>
      <table id="tab">
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
        </tr>
        <tbody>
          {/* <td>{fname}</td>
          <td>{lname}</td> */}
        </tbody>
      </table>
    </>
  );
}
export default LoginForm;
