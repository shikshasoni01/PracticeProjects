function Form2(props) {
  return (
    <>
      <table>
        <thead>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Mobile</th>
          <th>Email</th>
        </thead>
        <tr>
          <td>{props.data.fname}</td>
          <td>{props.data.lname}</td>
          <td>{props.data.mobileno}</td>
          <td>{props.data.email}</td>
        </tr>
      </table>
    </>
  );
}
export default Form2;
