namespace Fixtures.SwaggerBatBodyArray.Models
{
    using System;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    public partial class Product
    {
        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "integer")]
        public int? Integer { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "string")]
        public string StringProperty { get; set; }

        /// <summary>
        /// Validate the object. Throws ArgumentException or ArgumentNullException if validation fails.
        /// </summary>
        public virtual void Validate()
        {
            //Nothing to validate
        }
    }
}
