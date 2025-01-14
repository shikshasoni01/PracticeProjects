import { useState, useEffect } from "react";

const ApiFetch = () => {
  const [formdata, setFormData] = useState([]);
  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/todos")
      .then((response) => response.json())
      .then((json) => setFormData(json));
  }, []);
  return (
    <>
      {console.log(formdata)}
      <h3>All Records</h3>
      <table className="table table-hover">
        <thead>
          <tr>
            <th>UserId</th>
            <th>Id</th>
            <th>Title</th>
            <th>Completed</th>
          </tr>
        </thead>
        <tbody>
          {formdata.map((record) => (
            <tr key={record.id}>
              <td>{record.userId}</td>
              <td>{record.id}</td>
              <td>{record.title}</td>
              <td>{record.completed}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
};

export default ApiFetch;
