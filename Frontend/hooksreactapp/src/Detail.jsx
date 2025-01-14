import { useState } from "react";

function Detail() {
  const [fname, setFname] = useState("shiksha");
  const [lname, setLname] = useState("soni");
  const [role, setRole] = useState("developer");
  const [edit, isEditClicked] = useState(false);

  return (
    <>
      <h1>Form</h1>
      <table>
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Role</th>
        </tr>
        <tr>
          <td id="f">{fname}</td>
          <td id="l">{lname}</td>
          <td id="r">{role}</td>
        </tr>
      </table>
      <button
        onClick={() => {
          {
            isEditClicked(!edit);
          }
        }}
      >
        Edit
      </button>
      {edit && (
        <form>
          <input type="text" id="firstName" placeholder={fname}></input>
          <br></br>
          <br></br>
          <input type="text" id="lastName" placeholder={lname}></input>
          <br></br>
          <br></br>
          <input type="text" id="roleName" placeholder={role}></input>
          <br></br>
          <br></br>
          <button
            onClick={(e) => {
              e.preventDefault();
              setFname(document.getElementById("firstName").value);
              setLname(document.getElementById("lastName").value);
              setRole(document.getElementById("roleName").value);
            }}
          >
            Update
          </button>
        </form>
      )}
    </>
  );
}

export default Detail;
