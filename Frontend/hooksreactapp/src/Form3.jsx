import { useState } from "react";
import FormData from "./Form2";

function Form3() {
  const [formdata, setFormData] = useState({
    name: "",
    email: "",
    phone: "",
  });

  const [records, setRecords] = useState([]);

  function handleChange(e) {
    const { name, value } = e.target;
    setFormData({ ...formdata, [name]: value });
  }

  function handleSubmit(e) {
    e.preventDefault();

    // Check if the record already exists (by name)
    const existingRecordIndex = records.findIndex(
      (record) => record.name === formdata.name
    );

    if (existingRecordIndex !== -1) {
      // Update the existing record
      const updatedRecords = [...records];
      updatedRecords[existingRecordIndex] = {
        ...updatedRecords[existingRecordIndex],
        ...formdata,
      };
      setRecords(updatedRecords);
      alert("Record updated successfully!");
    } else {
      // Add a new record with a unique ID
      const newRecord = {
        id: records.length + 1, // Auto-increment ID
        ...formdata,
      };
      setRecords([...records, newRecord]);
      alert("Record added successfully!");
    }

    // Clear the form fields
    setFormData({
      name: "",
      email: "",
      phone: "",
    });
  }

  return (
    <>
      <form onSubmit={handleSubmit} className="form">
        <label htmlFor="name">Name:</label>
        <input
          type="text"
          id="name"
          name="name"
          placeholder="Enter your name"
          value={formdata.name}
          onChange={handleChange}
        />
        <br></br>
        <br></br>
        <label htmlFor="email">E-mail:</label>
        <input
          type="email"
          id="email"
          name="email"
          placeholder="Enter your email"
          value={formdata.email}
          onChange={handleChange}
        />
        <br></br>
        <br></br>
        <label htmlFor="phone">Phone:</label>
        <input
          type="tel"
          id="phone"
          name="phone"
          placeholder="Enter your phone number"
          value={formdata.phone}
          onChange={handleChange}
        />
        <br></br>
        <br></br>
        <button type="submit" className="btn btn-secondary">
          Submit
        </button>
      </form>

      {/* Show latest data in FormData
      <h3>Latest Submission</h3>
      <FormData data={formdata} /> */}

      {/* Display All Records */}
      <br></br>
      <h3>All Records</h3>
      <br></br>
      <table className="table table-hover">
        <thead>
          <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Email</td>
            <td>Phone</td>
          </tr>
        </thead>
        <tbody>
          {records.map((record) => (
            <tr key={record.id}>
              <td>{record.id}</td>
              <td>{record.name}</td>
              <td>{record.email}</td>
              <td>{record.phone}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
}

export default Form3;
