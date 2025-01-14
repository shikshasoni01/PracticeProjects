import { useState } from "react";
import axios from "axios";
import { useEffect } from "react";
function Show() {
  const [records, setRecord] = useState();

  useEffect(() => {
    axios
      .get("http://localhost:8001/getAllEmployee")
      .then((response) => {
        setRecord(response.data);
      })
      .catch(Error);
  }, []);

  return (
    <>
      <table className="table table-hover">
        <thead>
          <tr>
            <th>S. No.</th>
            <th>Name</th>
            <th>Profile</th>
            <th>Experience</th>
          </tr>
        </thead>
        <tbody>
          {Array.isArray(records)
            ? records.map((item, index) => (
                <tr key={index}>
                  <td>{index + 1}</td>

                  <td>{item.name}</td>
                  <td>{item.profile}</td>
                  <td>{item.experience}</td>
                </tr>
              ))
            : "No record found"}
        </tbody>
      </table>
    </>
  );
}
export default Show;
